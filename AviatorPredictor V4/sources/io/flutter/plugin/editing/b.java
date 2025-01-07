package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import q2.p;

/* loaded from: classes.dex */
public class b extends BaseInputConnection implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private final View f4551a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4552b;

    /* renamed from: c, reason: collision with root package name */
    private final p f4553c;

    /* renamed from: d, reason: collision with root package name */
    private final c f4554d;

    /* renamed from: e, reason: collision with root package name */
    private final EditorInfo f4555e;

    /* renamed from: f, reason: collision with root package name */
    private ExtractedTextRequest f4556f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4557g;

    /* renamed from: h, reason: collision with root package name */
    private CursorAnchorInfo.Builder f4558h;

    /* renamed from: i, reason: collision with root package name */
    private ExtractedText f4559i;

    /* renamed from: j, reason: collision with root package name */
    private InputMethodManager f4560j;

    /* renamed from: k, reason: collision with root package name */
    private final Layout f4561k;

    /* renamed from: l, reason: collision with root package name */
    private io.flutter.plugin.editing.a f4562l;

    /* renamed from: m, reason: collision with root package name */
    private final a f4563m;

    /* renamed from: n, reason: collision with root package name */
    private int f4564n;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public b(View view, int r10, p pVar, a aVar, c cVar, EditorInfo editorInfo) {
        this(view, r10, pVar, aVar, cVar, editorInfo, new FlutterJNI());
    }

    public b(View view, int r10, p pVar, a aVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f4557g = false;
        this.f4559i = new ExtractedText();
        this.f4564n = 0;
        this.f4551a = view;
        this.f4552b = r10;
        this.f4553c = pVar;
        this.f4554d = cVar;
        cVar.a(this);
        this.f4555e = editorInfo;
        this.f4563m = aVar;
        this.f4562l = new io.flutter.plugin.editing.a(flutterJNI);
        this.f4561k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f4560j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int r7) {
        if (r7 == 16908319) {
            setSelection(0, this.f4554d.length());
            return true;
        }
        if (r7 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f4554d);
            int selectionEnd = Selection.getSelectionEnd(this.f4554d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f4551a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f4554d.subSequence(min, max)));
                this.f4554d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (r7 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f4554d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f4554d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f4551a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f4554d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (r7 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f4551a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f4551a.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.f4554d));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.f4554d));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.f4554d.delete(min2, max4);
            }
            this.f4554d.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f4558h;
        if (builder == null) {
            this.f4558h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f4558h.setSelectionRange(this.f4554d.i(), this.f4554d.h());
        int g5 = this.f4554d.g();
        int f5 = this.f4554d.f();
        if (g5 < 0 || f5 <= g5) {
            this.f4558h.setComposingText(-1, "");
        } else {
            this.f4558h.setComposingText(g5, this.f4554d.toString().subSequence(g5, f5));
        }
        return this.f4558h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f4559i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f4554d.i();
        this.f4559i.selectionEnd = this.f4554d.h();
        this.f4559i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f4554d.toString() : this.f4554d;
        return this.f4559i;
    }

    private boolean e(boolean z4, boolean z5) {
        int selectionStart = Selection.getSelectionStart(this.f4554d);
        int selectionEnd = Selection.getSelectionEnd(this.f4554d);
        boolean z6 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z4 ? Math.max(this.f4562l.b(this.f4554d, selectionEnd), 0) : Math.min(this.f4562l.a(this.f4554d, selectionEnd), this.f4554d.length());
        if (selectionStart == selectionEnd && !z5) {
            z6 = true;
        }
        if (z6) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z4, boolean z5) {
        int selectionStart = Selection.getSelectionStart(this.f4554d);
        int selectionEnd = Selection.getSelectionEnd(this.f4554d);
        boolean z6 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z5) {
            z6 = true;
        }
        beginBatchEdit();
        if (z6) {
            if (z4) {
                Selection.moveUp(this.f4554d, this.f4561k);
            } else {
                Selection.moveDown(this.f4554d, this.f4561k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f4554d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z4) {
                Selection.extendUp(this.f4554d, this.f4561k);
            } else {
                Selection.extendDown(this.f4554d, this.f4561k);
            }
            setSelection(Selection.getSelectionStart(this.f4554d), Selection.getSelectionEnd(this.f4554d));
        }
        endBatchEdit();
        return true;
    }

    @Override // io.flutter.plugin.editing.c.b
    public void a(boolean z4, boolean z5, boolean z6) {
        this.f4560j.updateSelection(this.f4551a, this.f4554d.i(), this.f4554d.h(), this.f4554d.g(), this.f4554d.f());
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        ExtractedTextRequest extractedTextRequest = this.f4556f;
        if (extractedTextRequest != null) {
            this.f4560j.updateExtractedText(this.f4551a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f4557g) {
            this.f4560j.updateCursorAnchorInfo(this.f4551a, c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f4554d.b();
        this.f4564n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int r12) {
        return super.clearMetaKeyStates(r12);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f4554d.l(this);
        while (this.f4564n > 0) {
            endBatchEdit();
            this.f4564n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int r22) {
        return super.commitText(charSequence, r22);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int r32, int r4) {
        if (this.f4554d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(r32, r4);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int r12, int r22) {
        return super.deleteSurroundingTextInCodePoints(r12, r22);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f4564n--;
        this.f4554d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
                return false;
            }
            int selectionEnd = Selection.getSelectionEnd(this.f4554d);
            setSelection(selectionEnd, selectionEnd);
            return true;
        }
        if (keyEvent.getKeyCode() == 21) {
            return e(true, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 22) {
            return e(false, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 19) {
            return g(true, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 20) {
            return g(false, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
            EditorInfo editorInfo = this.f4555e;
            if ((131072 & editorInfo.inputType) == 0) {
                performEditorAction(editorInfo.imeOptions & 255);
                return true;
            }
        }
        int selectionStart = Selection.getSelectionStart(this.f4554d);
        int selectionEnd2 = Selection.getSelectionEnd(this.f4554d);
        int unicodeChar = keyEvent.getUnicodeChar();
        if (selectionStart < 0 || selectionEnd2 < 0 || unicodeChar == 0) {
            return false;
        }
        int min = Math.min(selectionStart, selectionEnd2);
        int max = Math.max(selectionStart, selectionEnd2);
        beginBatchEdit();
        if (min != max) {
            this.f4554d.delete(min, max);
        }
        this.f4554d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
        int r12 = min + 1;
        setSelection(r12, r12);
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f4554d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int r5) {
        boolean z4 = (r5 & 1) != 0;
        if (z4 == (this.f4556f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z4 ? "on" : "off");
            e2.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f4556f = z4 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int r12) {
        beginBatchEdit();
        boolean b5 = b(r12);
        endBatchEdit();
        return b5;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int r32) {
        if (r32 == 0) {
            this.f4553c.n(this.f4552b);
        } else if (r32 == 1) {
            this.f4553c.f(this.f4552b);
        } else if (r32 == 2) {
            this.f4553c.e(this.f4552b);
        } else if (r32 == 3) {
            this.f4553c.k(this.f4552b);
        } else if (r32 == 4) {
            this.f4553c.l(this.f4552b);
        } else if (r32 == 5) {
            this.f4553c.g(this.f4552b);
        } else if (r32 != 7) {
            this.f4553c.d(this.f4552b);
        } else {
            this.f4553c.i(this.f4552b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f4553c.h(this.f4552b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int r5) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((r5 & 1) != 0) {
            this.f4560j.updateCursorAnchorInfo(this.f4551a, c());
        }
        boolean z4 = (r5 & 2) != 0;
        if (z4 != this.f4557g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z4 ? "on" : "off");
            e2.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f4557g = z4;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f4563m.a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int r12, int r22) {
        return super.setComposingRegion(r12, r22);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int r32) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, r32) : super.setComposingText(charSequence, r32);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int r12, int r22) {
        beginBatchEdit();
        boolean selection = super.setSelection(r12, r22);
        endBatchEdit();
        return selection;
    }
}

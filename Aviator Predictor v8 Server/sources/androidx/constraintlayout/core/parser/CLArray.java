package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes40.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] content) {
        super(content);
    }

    public static CLElement allocate(char[] content) {
        return new CLArray(content);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        StringBuilder content = new StringBuilder(getDebugName() + "[");
        boolean first = true;
        for (int i = 0; i < this.mElements.size(); i++) {
            if (!first) {
                content.append(", ");
            } else {
                first = false;
            }
            content.append(this.mElements.get(i).toJSON());
        }
        return ((Object) content) + "]";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int indent, int forceIndent) {
        StringBuilder json = new StringBuilder();
        String val = toJSON();
        if (forceIndent <= 0 && val.length() + indent < MAX_LINE) {
            json.append(val);
        } else {
            json.append("[\n");
            boolean first = true;
            Iterator<CLElement> it = this.mElements.iterator();
            while (it.hasNext()) {
                CLElement element = it.next();
                if (!first) {
                    json.append(",\n");
                } else {
                    first = false;
                }
                addIndent(json, BASE_INDENT + indent);
                json.append(element.toFormattedJSON(BASE_INDENT + indent, forceIndent - 1));
            }
            json.append("\n");
            addIndent(json, indent);
            json.append("]");
        }
        return json.toString();
    }
}

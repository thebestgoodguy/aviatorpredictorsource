package com.bumptech.glide.request;

/* loaded from: classes54.dex */
public interface RequestCoordinator {
    boolean canNotifyCleared(Request request);

    boolean canNotifyStatusChanged(Request request);

    boolean canSetImage(Request request);

    RequestCoordinator getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(Request request);

    void onRequestSuccess(Request request);

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean isComplete) {
            this.isComplete = isComplete;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }
}

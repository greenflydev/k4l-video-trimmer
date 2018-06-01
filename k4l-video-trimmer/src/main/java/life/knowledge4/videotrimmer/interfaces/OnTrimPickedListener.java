package life.knowledge4.videotrimmer.interfaces;

public interface OnTrimPickedListener {

    void videoClicked(boolean playing);

    void getResult(final int trimStartMs, final int trimEndMs);

    void cancelAction();
}

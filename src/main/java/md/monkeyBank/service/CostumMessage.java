package md.monkeyBank.service;

public enum CostumMessage {
    USER_NOT_FOUND("User not found")
    ;

    private final String text;

    /**
     * @param text
     */
    CostumMessage(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}

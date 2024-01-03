class Quest {
    private String description;
    private Item questItem;

    public Quest(String description, Item questItem) {
        this.description = description;
        this.questItem = questItem;
    }

    public String getDescription() {
        return description;
    }

    public Item getQuestItem() {
        return questItem;
    }
}
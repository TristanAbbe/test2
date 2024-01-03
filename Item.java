public class Item {
    private final String name;
    private final String description;
    private boolean stackable;
    private boolean removable;
    private final String iconPath;

    public Item(String name, String description, String iconPath) {
        this.name = name.trim();
        this.description = description;
        this.iconPath = iconPath.trim();
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }

    public boolean isStackable() {
        return stackable;
    }

    public boolean isRemovable() {
        return removable;
    }

    public String getIconPath() {
        return iconPath;
    }

    private boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }
}

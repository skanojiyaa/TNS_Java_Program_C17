package Day14_UserException;

public class Color {
    private String colorName;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        try {
            if (!colorName.equalsIgnoreCase("red") && !colorName.equalsIgnoreCase("green") && !colorName.equalsIgnoreCase("white")) {
                throw new InvalidColorException("Color is not allowed");
            } else {
                this.colorName = colorName;
            }
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Color [colorName=" + colorName + "]";
    }
}

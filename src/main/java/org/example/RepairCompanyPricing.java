import javax.swing.JOptionPane;

  public class RepairCompanyPricing {
    public static void main(String[] args) {
        double wallPlasteringPrice = 100;
        double paintingPrice = 30;
        double floorPanelPrice = 50;
        double skirtingBoardPrice = 40;

        double roomWidth = Double.parseDouble(JOptionPane.showInputDialog("Enter room width (meters):"));
        double roomLength = Double.parseDouble(JOptionPane.showInputDialog("Enter room length (meters):"));
        double roomHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter room height (meters):", "2.50"));

        double floorArea = roomWidth * roomLength;
        double ceilingArea = roomWidth * roomLength;
        double wallArea = 2 * roomHeight * (roomWidth + roomLength);
        double perimeter = 2 * (roomWidth + roomLength);

        int plasteringChoice = JOptionPane.showConfirmDialog(null, "Do you want wall plastering?");
        int paintingChoice = JOptionPane.showConfirmDialog(null, "Do you want painting walls and ceilings?");
        int floorPanelChoice = JOptionPane.showConfirmDialog(null, "Do you want laying floor panels?");
        int skirtingBoardChoice = JOptionPane.showConfirmDialog(null, "Do you want skirting boards?");

        double totalPrice = 0;

        if (plasteringChoice == JOptionPane.YES_OPTION) {
            totalPrice += wallArea * wallPlasteringPrice;
        }

        if (paintingChoice == JOptionPane.YES_OPTION) {
            totalPrice += (wallArea + ceilingArea) * paintingPrice;
        }

        if (floorPanelChoice == JOptionPane.YES_OPTION) {
            totalPrice += floorArea * floorPanelPrice;
        }

        if (skirtingBoardChoice == JOptionPane.YES_OPTION) {
            totalPrice += perimeter * skirtingBoardPrice;
        }

        JOptionPane.showMessageDialog(null, "Total price for the job: PLN " + totalPrice);
    }
}
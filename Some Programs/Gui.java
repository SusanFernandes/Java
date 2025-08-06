import javax.swing.JOptionPane;
class Gui{
    public static void main(String[] a){

        String name= JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //converting string to int
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
    }
}
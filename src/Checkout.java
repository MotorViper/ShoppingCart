import ShoppingCart.IItem;
import ShoppingCart.ITill;
import ShoppingCart.ItemFactory;
import ShoppingCart.Till;

import javax.swing.*;
import java.rmi.UnexpectedException;
import java.util.Objects;

class Checkout {
    private JComboBox _itemSelection;
    private JButton _addButton;
    private JButton _totalButton;
    private JTextField _totalField;
    private JButton _payButton;
    private JPanel _mainForm;
    private final ITill _till;

    private Checkout() {
        _till = new Till();
        _addButton.addActionListener(e -> addItem());
        _totalButton.addActionListener(e -> displayTotal());
        _payButton.addActionListener(e -> resetTotal());
    }

    private void resetTotal() {
        _totalField.setText("0");
        _till.reset();
    }

    private void addItem() {
        String selected = Objects.requireNonNull(_itemSelection.getSelectedItem()).toString();
        try {
            IItem item = ItemFactory.Create(selected);
            _till.addItem(item);
            _totalField.setText(String.valueOf(item.getPrice()));
        } catch (UnexpectedException e1) {
            _totalField.setText(e1.getMessage());
        }
    }

    private void displayTotal() {
        _totalField.setText(String.valueOf(_till.sum()));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkout");
        frame.setContentPane(new Checkout()._mainForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

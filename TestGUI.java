import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;

public class TestGUI {
    private Button dynamicButton;

    public Parent createGUI() {
        // Create layout
        BorderPane root = new BorderPane();

        // Top section (header)
        root.setTop(new StackPane(new javafx.scene.control.Label("JavaFX App")));

        // Center section (main content)
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Button button1 = new Button("Button 1");
        button1.setOnAction(e -> System.out.println("Button 1 clicked"));
        grid.add(button1, 0, 0);

        dynamicButton = new Button("Dynamic Button");
        dynamicButton.setOnAction(e -> initialAction());
        grid.add(dynamicButton, 1, 0);

        root.setCenter(grid);

        // Bottom section
        root.setBottom(new VBox(new javafx.scene.control.Label("Footer")));

        return root;
    }

    private void initialAction() {
        System.out.println("Initial Action Performed");
        // Change button functionality
        dynamicButton.setOnAction(e -> System.out.println("New Action Performed"));
        dynamicButton.setText("Functionality Changed!");
    }
}

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ContextMenuBuilder;
import javafx.scene.control.MenuItemBuilder;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MyApp extends Application
{
    TreeItem<String> rootNode = new TreeItem<>("MyCompany Human Resources");

    public static void main(String[] args) {
        Application.launch(args);
    }

    TreeView<String> treeView = new TreeView<>(rootNode);

    @Override
    public void start(Stage stage)
    {

        // instantiate the root context menu
        ContextMenu rootContextMenu = ContextMenuBuilder.create()
                .items(
                        MenuItemBuilder.create()
                                .text("Menu Item")
                                .onAction(new EventHandler<ActionEvent>() {
                                            @Override
                                            public void handle(ActionEvent arg0)
                                            {
                                                System.out.println("Menu Item Clicked!");
                                            }
                                        }
                                )
                                .build()
                )
                .build();

        treeView.setContextMenu(rootContextMenu);

        stage.setTitle("Tree View Sample");
        VBox box = new VBox();
        final Scene scene = new Scene(box, 400, 300);
        scene.setFill(Color.LIGHTGRAY);


        box.getChildren().add(treeView);
        stage.setScene(scene);
        stage.show();
    }
}
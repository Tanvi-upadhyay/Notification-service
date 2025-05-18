module com.rabmq.springbootrabbitmq {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rabmq.springbootrabbitmq to javafx.fxml;
    exports com.rabmq.springbootrabbitmq;
}
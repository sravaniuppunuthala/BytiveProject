package todo.app.softwareTraineeAssignment.todo.app.Security;
import java.util.UUID;

public class SecretKeyGenerator {
    public static void main(String[] args) {
        String secretKey = UUID.randomUUID().toString();
        System.out.println("Generated Secret Key: " + secretKey);
    }
}

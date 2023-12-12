package handle.menu;

import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MenuAnimation {

    // Phương thức để hiển thị hoặc ẩn một mục menu với hiệu ứng animation
    public static void showMenu(Component component, MenuItem item, MigLayout layout, boolean show) {
        // Lấy chiều caocủa thành phần
        int height = component.getPreferredSize().height;
        // Tạo một Animator với thời gian chạy là 300 mili giây
        Animator animator = new Animator(300, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                // Tính toán tỉ lệ tiến trình animation
                float f = show ? fraction : 1f - fraction;
                // Điều chỉnh chiều cao của thành phần sử dụng ràng buộc MigLayout
                layout.setComponentConstraints(component, "h " + height * f + "!");
                //layout.setComponentConstraints(component, String.format("h %.2f!", height * f));
                // Tạo một Animator với thời gian chạy là 300 mili giây
                item.setAnimate(f);
                // Revalidate thành phần để phản ánh các thay đổi bố cục
                component.revalidate();
                // Vẽ lại mục menu để cập nhật giao diện
                item.repaint();
            }
        });
        // Đặt các thuộc tính bổ sung cho Animator
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        animator.start();
    }
}

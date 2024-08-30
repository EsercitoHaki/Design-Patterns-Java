# Design Patterns
Design Patterns (Mâu thiết kế) là những giải pháp đã được chứng minh và chuẩn hoá các vấn đề thiết kế phần mềm phổ biến. Chúng giúp cải thiện khả năng tái sử dụng, duy trì và mở rộng của mã nguồn.
## Định nghĩa
Design Pattern là những mô hình hoặc giải pháp tiêu chuẩn cho các vấn đề thường gặp trong thiết kế phần mềm. Chúng không phải là mã nguồn cụ thể mà là các giải pháp mô hình cho các vấn đề thiết kế.
## Mục tiêu của Design Pattern
- Tăng tốc độ phát triển phần mềm
- Giảm sự phức tạp của code
- Tăng tính nhất quán
- Tiết kiệm thời gian và dễ dàng làm việc Team Work
- Dễ dàng tái mở rộng và tái sử dụng code
## Phân loại Design Pattern
Design Patterns thường được phân thành ba nhóm chính:

**1.** **Creational Patterns (Mẫu Tạo Thực):** Xác định cách tạo đối tượng mà không phải phụ thuộc vào lớp cụ thể nào.

- **Singleton:** Đảm bảo chỉ có một instance của một lớp và cung cấp một điểm truy cập toàn cầu đến instance đó.
- **Factory Method:** Cung cấp một phương thức để tạo đối tượng mà không cần chỉ rõ lớp của đối tượng đó.
- **Abstract Factory:** Cung cấp một giao diện để tạo các họ đối tượng mà không phải xác định lớp cụ thể.
- **Builder:** Tách việc tạo đối tượng từ việc biểu diễn của nó, cho phép cùng một quá trình tạo ra các đại diện khác nhau.
- **Prototype:** Tạo các đối tượng mới bằng cách sao chép các đối tượng đã tồn tại.

**2.** **Structural Patterns (Mẫu Cấu Trúc):** Xác định cách các lớp và đối tượng kết hợp với nhau để tạo thành cấu trúc lớn hơn.

- **Adapter:** Chuyển đổi giao diện của một lớp thành giao diện mà khách hàng mong đợi.
- **Decorator:** Thêm các trách nhiệm bổ sung cho một đối tượng một cách linh hoạt và động.
- **Facade:** Cung cấp một giao diện đơn giản hơn cho một hệ thống phức tạp.
- **Composite:** Cho phép khách hàng xử lý các đối tượng đơn lẻ và tổ hợp của chúng theo cách đồng nhất.
- **Bridge:** Tách giao diện khỏi cài đặt, cho phép chúng thay đổi độc lập với nhau.

**3.** **Behavioral Patterns (Mẫu Hành Vi):** Xác định cách các đối tượng và lớp tương tác với nhau.

- **Observer:** Cung cấp một cơ chế để các đối tượng theo dõi và phản hồi sự thay đổi trạng thái của một đối tượng khác.
- **Strategy:** Cho phép thay đổi hành vi của một đối tượng tại thời điểm chạy bằng cách thay đổi thuật toán.
- **Command:** Biến một yêu cầu thành một đối tượng, cho phép lưu trữ, hủy bỏ hoặc thực hiện yêu cầu.
- **State:** Cho phép một đối tượng thay đổi hành vi khi trạng thái của nó thay đổi.
- **Mediator:** Giảm sự phụ thuộc giữa các đối tượng bằng cách định tuyến thông tin thông qua một đối tượng trung gian.

## Ví dụ
- **Singleton:** Trong một ứng dụng, bạn chỉ cần một instance của lớp *`ConfigurationManager`* để quản lý cấu hình toàn cục.
- **Observer:** Trong một hệ thống giao dịch chứng khoán, khi giá của một cổ phiếu thay đổi, tất cả các nhà đầu tư đang theo dõi được thông báo.

## Tài liệu tham khảo
- **Design patterns Elements of Reusable Object Oriented Software**
- **Head First Design Patterns**
- **Design Patterns for Dummies**
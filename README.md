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

| Creational       | Structure | Behavioral              |
|------------------|-----------|-------------------------|
| Abstract factory | Adapter   | Chain of responsibility |
| Builder          | Bridge    | Command                 |
| Factory          | Composite | Interpreter             |
| Prototype        | Decorator | Iterator                |
| Singleton        | Facade    | Mediator                |
| Flyweight        | Memento   | Memento                 |
|                  | Proxy     | Observer                |
|                  |           | Strategy                |
|                  |           | Template Method         |
|                  |           | Visitor                 |
|                  |           | State                   |

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
- **Flyweight:** Giảm thiểu việc sử dụng tài nguyên bằng cách chia sẻ các đối tượng tương tự.
- **Proxy:** Cung cấp một đối tượng đại diện hoặc giữ chỗ cho một đối tượng khác.

**3.** **Behavioral Patterns (Mẫu Hành Vi):** Xác định cách các đối tượng và lớp tương tác với nhau.

- **Observer:** Cung cấp một cơ chế để các đối tượng theo dõi và phản hồi sự thay đổi trạng thái của một đối tượng khác.
- **Strategy:** Cho phép thay đổi hành vi của một đối tượng tại thời điểm chạy bằng cách thay đổi thuật toán.
- **Command:** Biến một yêu cầu thành một đối tượng, cho phép lưu trữ, hủy bỏ hoặc thực hiện yêu cầu.
- **State:** Cho phép một đối tượng thay đổi hành vi khi trạng thái của nó thay đổi.
- **Mediator:** Giảm sự phụ thuộc giữa các đối tượng bằng cách định tuyến thông tin thông qua một đối tượng trung gian.
- **Memento:** Cung cấp cơ chế để phục hồi trạng thái trước đó của một đối tượng mà không làm lộ cấu trúc bên trong của nó.
- **Chain of Responsibility:** Cho phép các đối tượng xử lý một yêu cầu mà không cần phải xác định người xử lý cụ thể.
- **Iterator:** Cung cấp cách truy cập các phần tử của một đối tượng tuần tự mà không cần lộ cấu trúc nội bộ của nó.
- **Visitor:** Cho phép thêm các hành vi mới vào các đối tượng mà không thay đổi các lớp của chúng.
- **Interpreter:** Cung cấp một cách để giải thích hoặc phân tích ngữ nghĩa của một ngôn ngữ hoặc cú pháp cụ thể. Thường dùng trong các hệ thống xử lý ngôn ngữ hoặc các ngữ nghĩa phức tạp.
- **Template Method:** Định nghĩa cấu trúc của một thuật toán trong lớp cơ sở, nhưng cho phép các lớp con thay đổi các bước cụ thể của thuật toán mà không thay đổi cấu trúc của thuật toán đó.

## Ví dụ
- **Singleton:** Trong một ứng dụng, bạn chỉ cần một instance của lớp *`ConfigurationManager`* để quản lý cấu hình toàn cục.
- **Observer:** Trong một hệ thống giao dịch chứng khoán, khi giá của một cổ phiếu thay đổi, tất cả các nhà đầu tư đang theo dõi được thông báo.

## Tài liệu tham khảo
- **Design patterns Elements of Reusable Object Oriented Software**
- **Head First Design Patterns**
- **Design Patterns for Dummies**
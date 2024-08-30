# SINGLETON DESIGN PATTERS

## Khái niệm

Singleton là một mẫu thiết kế Creational đảm bảo rằng chỉ có một instance duy nhất của một lớp duy nhất được tạo ra và cung cấp một điểm truy cập toàn cầu đến instance đó.

## Đặc điểm chính

- **Chỉ một Instance:** Singleton bảo đảm rằng chỉ có một đối tượng của lớp này tồn tại trong suốt vòng đời của ứng dụng. Điều này thường được thể hiện bằng cách quản lý đối tượng thông qua một biến tĩnh hoặc một phương thức.
-  **Điểm truy cập toàn cầu:** Cung cấp một phương thức tĩnh hoặc phương thức truy cập toàn cục để lấy instance duy nhất của lớp. Điều này giúp người dùng truy cập đối tượng mà không cần tạo mới mỗi lần.

## Cấu trúc

- **Private Constructor:** Để ngăn chặn việc tạo đối tượng từ bên ngoài lớp, `Constructor` của lớp thường được khai báo `private`. 
- **Static Instance:** Lớp chứa biến tĩnh để giữ `instance` duy nhất.
- **Static Method:** Cung cấp một phương thức tĩnh để lấy `instance` của lớp. Phương thức này kiểm tra nếu `instance` đã được tạo, nếu không sẽ tạo mới.

## Ưu điểm
- **Kiểm soát truy cập:** Đảm bảo rằng chỉ có một `instance` của lớp tồn tại và cung cấp một điểm truy cập duy nhất.
- **Tiết kiệm tài nguyên:** Giảm chi phí tạo và quản lý nhiều `instance` của cùng một lớp. 
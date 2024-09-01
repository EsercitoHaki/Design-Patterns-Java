# ADAPTER DESIGN PATTERNS

**Adapter** là một trong những mẫu thiết kế của nhóm cấu trúc `Structural Design Patterns`. Nó được sử dụng để kết nối 2 lớp `interface` không tương thích với nhau, giúp cho các lớp có giao diện khác nhau làm việc được với nhau.

## Mục đích

Mục đích chính của Adapter là biến đổi giao diện của một lớp thành một giao diện khác mà `client` mong muốn. Nói cách khác, Adapter hoạt động như một lớp trung gian để chuyển đổi giao diện của một lớp có sẵn sao cho nó có thể tương thích với giao diện mà client đang sử dụng.

## Khi nào sử dụng Adapter Design Pattern?

- Bạn có một lớp đã tồn tại với một giao diện không phù hợp với hệ thống mới.
- Bạn muốn sử dụng lại các lớp cũ trong một ứng dụng mới nhưng không muốn thay đổi mã nguồn của lớp đó.

## Cách triển khai Adapter Design Pattern

Một cách triển khai phổ biến là sử dụng Composition. Adapter chứa một đối tượng của lớp cần chuyển đổi và chuyển đổi các lời gọi phương thức tới đối tượng đó sang định dạng mà client mong đợi.

## Ưu điểm

- Giúp tái sử dụng các lớp hiện có mà không cần sửa đổi mã nguồn của chúng.
- Cải thiện tính linh hoạt và khả năng mở rộng của hệ thống.

## Nhược điểm

- Có thể làm tăng sự phức tạp của hệ thống khi sử dụng nhiều Adapter.
- Việc sử dụng Adapter có thể gây ra hiệu suất thấp nếu phải chuyển đổi nhiều phương thức.

## Kết luận

Adapter Design Pattern rất hữu ích khi bạn cần kết nối các lớp với giao diện không tương thích. Nó cho phép bạn tái sử dụng mã nguồn hiện có và giữ cho hệ thống linh hoạt và dễ mở rộng.
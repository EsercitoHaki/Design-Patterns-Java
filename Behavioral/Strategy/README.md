# Strategy Design Patterns

Strategy Design Patterns là một trong những mẫu thiết kế hành vi (Behavioral Design Patterns) được sử dụng để định nghĩa một tập hợp các thuật toán, `Encapsulation` chúng thành các `Class` riêng biệt, và làm cho các thuật toán này cố thể thay đổi trong lúc chương trình đang chạy mà không cần thay đổi mã nguồn của đối tượng sử dụng thuật toán đó.

## Các thành phần chính
**1.** **Context:** Là đối tượng sử dụng thuật toán. Context thường giữ mootj tham chiếu đến một đối tượng Strategy cụ thể và sử dụng nó để thực hiện hành động.

**2.** **Strategy:** Là một giao diện (hoặc một lớp trừu tượng) định nghĩa các phương thức mà tất cả các thuật toán phải triển khai.

**3.** **Concrete Strategies:** Là các lớp cụ thể triển khai Strategy Interface, mỗi lớp chứa một thuật toán riêng biệt.

## Cách hoạt động
- Context không biết hoặc không quan tâm đến lớp cụ thể nàoo của Strategy đang được sử dụng, nói chỉ biết rằng nó có thể gọi các phương thức của Strategy để thực hiện hành động.

- Các thuật toán (Concrete Strategies) có thể được thay đổi trong lúc chạy bằng cách thay thế đối tượng Strategy hiện tại trong Context bằng một đối tượng khác.

## Ưu điểm
- **Thay đổi dễ dàng:** Bạn có thể thêm hoặc thay đổi thuật toán mà không cần phải chỉnh sửa mã nguồn của Context.

- **Tăng khả năng tái sử dụng:** Các thuật toán có thể được sử dụng lại trong các ngữ cảnh khác nhau.
- **Đơn giản hoá mã nguồn:** Giảm thiểu các câu lệnh điều kiện phức tạp trong Context.

## Nhược điểm
- **Tăng số lượng lớp:** Có thể dẫn đến việc tạo ra nhiều lớp, làm tăng độ phức tạp của hệ thống.
- **Phải hiểu về chiến lược:** Người sử dụng cần hiểu về chiến lược nào đang được sử dụng để có thể quản lý và thay đổi chiến lược một cáchc hợp lý.

## Khi nào thì sử dụng
- Muốn sử dụng các biến thể khác nhau của một xử lý trong một đối tượng và có thể chuyển đổi giữa các xử lý trông `runtime`.
- Khi có nhiều lớp tương đương chỉ khác cách chúng thực thi một vài hành vi
- Khi muốn tách biệt `business logic` của một lớp khỏi `implementation details` của các xử lý.
- Khi lớp có toán tử điều kiện lớn chuyển đổi giữa các biến thể của cùng một xử lý. 
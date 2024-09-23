# STATE DESIGN PATTERNS

State Design Patterns là một trong những mẫu thiết kế thuộc nhóm `Behavioral Patterns` (mẫu hành vi). Mẫu này cho phép một đối tượng thay đổi hành vi của nó khi trạng thái bên trong thay đổi, như thể lớp của đối tượng đó thay đổi.

## Khái niệm

State cho phép đối tượng thể hiện hành vi khác nhau tuỳ thuộc vào trạng thái nội tại của nó. Bằng cách này, bạn có thể tránh sử dụng nhiều câu lệnh `if-else` hoặc `switch-case` để kiểm tra trạng thái, thay vào đó sử dụng các lớp trạng thái cụ thể để xác định hành vi của đối tượng.

## Thành phần

**1.** **Context:** Đối tượng này có trạng thái hiện tại và hành vi của nó thay đổi dựa trên trạng thái đó. Nó duy trì một tham chiếu đến một đối tượng trạng thái cụ thể.
**2.** **State Interface:** Định nghĩa một giao diện chung cho tất cả các trạng thái cụ thể. Nó khai báo các phương thức mà các trạng thái cụ thể sẽ triển khai.
**3.** **Concrete State:** Các lớp trạng thái cụ thể, mỗi lớp đại diện cho một trạng thái của Context. Khi trạng thái thay đổi, nó sẽ cài đặt các phương thức của State Interface theo cách khác nhau.

## Cách hoạt động

Khi một hành động được thực hiện trên `Context`, nó sẽ chuyển tiếp hành động đó đến đối tượng trang thái hiện tại. Dựa trên trạng thái hiện tại, hành vi cụ thể sẽ được thực hiện. Điều này cho phép `Context` dễ dàng thay đổi hành vi bằng cách chỉ thay đổi đối tượng trạng thái.

## Ưu điểm

- Dễ dàng mở rộng thêm trạng thái mới mà không ảnh hưởng tới mã nguồn hiện tại.
- Giảm thiếu việc sử dụng các câu lệnh `if-else` hoặc `switch-case` dài và phức tạp.
- Đảm bảo mỗi trạng thái chỉ thực hiện một hành vi cụ thể.

## Nhược điểm

- Cần tạo nhiều lớp trạng thái cụ thể, có thể làm tăng độ phức tạp của hệ thống nếu có quá nhiều trạng thái.

## Ví dụ

Hãy tưởng tượng bạn cố một máy bán hàng tự động (vending machine). Máy này có các trạng thái như `Idle`, `HasMoney` và `Dispense`. Dựa trên trạng thái hiện tại, máy sẽ thực hiện các hành vi khác nhau:

- Khi ở trạng thái `Idle`, nếu có tiền được dựa vào, máy sẽ chuyển sang trạng thái 'HasMoney'.
- Ở trạng thái `HasMoney`, nêuus chọn sản phẩm, máy sẽ chuyển sang trạng thái `Dispense` và phát hành.
- Sau khi phát hàng xong, máy sẽ trở lại trạng thái `Idle`.
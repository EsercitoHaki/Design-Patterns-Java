# FACTORY DESIGN PATTERNS

Factory là một trong những Creational Design Pattern phổ biến, giúp tạo đối tượng mà không cần chỉ định lớp cụ thể của chúng. Đây là một giải pháp hữu ích khi bạn muốn tạo đối tượng nhưng không biết chính xác lớp cụ thể nào sẽ được sử dụng cho đến khi chạy chương trình.

## Khái niệm
- **Factory:** Một phương thức trong lớp hoặc `interface` có nhiệm vụ trả về một đối tượng. Thay vì sử dụng từ khoá `new` để khởi tạo trực tiếp, bạn khởi tạo Factory để khởi tạo đối tượng.
- **Interface/Product:** Đây là giao diện hoặc lớp cha mà tất cả các lớp sản phẩm cụ thể sẽ triển khai hoặc kế thừa.

## Lợi ích
- Giảm sự phụ thuộc của các lớp
- Dễ bảo trì
- Tăng tính linh hoạt

## Mở rộng
Factory có thể được mở rộng bằng cách sử dụng `Abstract Factory Pattern` khi bạn cần tạo ra các họ sản phẩm liên quan mà không cần chỉ định lớp cụ thể

## Khi nào nên sử dụng Factory Pattern ?
- Khi bạn cần kiểm soát hoặc thay đổi quá trình tạo đối tượng
- Khi bạn có một số lớp con mà chúng chia sẽ một giao diện hoặc một lớp cha.
- Khi việc khởi tạo một đối tượng cụ thể phụ thuộc vào logic mà bạn không viết trong lớp client.
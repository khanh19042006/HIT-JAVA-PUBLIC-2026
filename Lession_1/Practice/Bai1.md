# Bài 1

# Bài toán: Tìm đường ngắn nhất bằng thuật toán A*

Cho đồ thị sau:

```text
        A
      /   \
   1 /     \ 4
    B-------C
   / \     / \
 5/   \2  1   \3
 D     E-------F
  \         2 /
   \_______/
       6
```

Các cạnh có trọng số:

| Cạnh | Chi phí |
|------|---------|
| A-B | 1 |
| A-C | 4 |
| B-C | 2 |
| B-D | 5 |
| B-E | 2 |
| C-E | 1 |
| C-F | 3 |
| E-F | 2 |
| D-F | 6 |

Giá trị heuristic `h(n)` đến đích **F**:

| Đỉnh | h(n) |
|------|------|
| A | 5 |
| B | 4 |
| C | 2 |
| D | 6 |
| E | 1 |
| F | 0 |

## Yêu cầu

Hãy sử dụng **thuật toán A\*** để tìm đường đi ngắn nhất từ **A** đến **F**.

1. Tính các giá trị:
   - `g(n)`
   - `h(n)`
   - `f(n) = g(n) + h(n)`
2. Ghi lại trạng thái của **OPEN** và **CLOSED** sau mỗi lần mở rộng một đỉnh.
3. Xác định:
   - Thứ tự các đỉnh được mở rộng.
   - Đường đi ngắn nhất.
   - Tổng chi phí.
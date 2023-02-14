package annotation.validation.com.example.demo.annotation.validation.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookDto {
    @NotBlank(message = "Book name is required")
    @Size(min = 5, max = 50, message
            = "Book name must be between 5 and 50 characters")
    private String book_name;
    @NotBlank(message = "Author name is required")
    @Size(min = 5, max = 200, message
            = "Author name must be between 10 and 200 characters")
    private String ahthor_name;
    @NotNull(message = "Price should not be empty")
    @Min(value = 50, message = "Price should not be less than 50")
    @Max(value = 500, message = "Price should not be greater than 500")
    private Integer price;
}

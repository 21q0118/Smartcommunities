package ltbyz.practice_demo.wisdom_block.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserLogin {
    private String PHnum;
    private String Ppword;
    private String isreal;
}

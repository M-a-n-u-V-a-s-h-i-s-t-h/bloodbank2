package org.management.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectResponse
{
    private Integer code;
    private String message;
    private Object data;
    private Object CustomerID ;
}
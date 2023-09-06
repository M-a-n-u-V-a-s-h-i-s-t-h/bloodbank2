package org.management;
import org.management.Entity.ManagementEntity;
import org.management.Entity.ProjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/detail")
public class ManagementController {
    @Autowired
    public ManagementService service;

    @GetMapping("/getdetails")
    public ResponseEntity<ProjectResponse> ManageById(@PathVariable("id") Integer id) {
        ManagementEntity entity = service.ManageById(id);
        if (entity == null) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ProjectResponse.builder().code(HttpStatus.OK.value()).message("No Data Found For Given ID").build());
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ProjectResponse.builder().code(HttpStatus.OK.value()).message("Data Displayed For Given ID").data(entity).build());
    }
        @PostMapping("/adduser")
    public ResponseEntity<ProjectResponse> addUser(@RequestBody AddUserDTO body)

        {
        ManagementEntity entity = service.addUser(body);
            return ResponseEntity
                .status(HttpStatus.OK)
                .body(ProjectResponse.builder().code(HttpStatus.OK.value()).message("Data Stored Succesfully").data(body).CustomerID(entity.getId()).build());
    }
}








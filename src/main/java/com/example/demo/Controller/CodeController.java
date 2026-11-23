
package com.example.demo.Controller;

import com.example.demo.Model.CodeModel;
import com.example.demo.Service.CodeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/code")
public class CodeController {

    private final CodeService codeService;

    public CodeController(CodeService codeService) {
        this.codeService = codeService;
    }

    
    @PostMapping("/get")
    public String getCode(@RequestBody CodeModel codeModel) {

        String code = codeModel.getCode();

        return codeService.codeAnalysis(code);
    }
}

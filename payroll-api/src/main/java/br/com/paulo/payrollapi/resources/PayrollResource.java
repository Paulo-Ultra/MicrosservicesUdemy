package br.com.paulo.payrollapi.resources;

import br.com.paulo.payrollapi.domain.Payroll;
import br.com.paulo.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/payments")
public class PayrollResource {

    private final PayrollService payrollService;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {

        return ResponseEntity.ok().body(payrollService.getPayment(workerId, payment));
    }
}

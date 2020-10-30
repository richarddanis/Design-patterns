package visitor.model;

import org.junit.jupiter.api.Test;

public class CompanyTest {

    @Test
    public void testVisitorPattern() {
        Company company = new Company();
        company.generateCompanyReport();
    }
}

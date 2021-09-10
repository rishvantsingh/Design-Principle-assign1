package SignlerResponsibilityP;

public class EmployeeStore implements IEmployeeStore
{
    //inject in runtime
    private IEmailSender emailSender;

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {
    }
}

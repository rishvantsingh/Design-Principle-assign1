package SignlerResponsibilityP;

public interface IEmployeeStore
{
    public Employee getEmployeeById(Long id);

    public void addEmployee(Employee employee);
}
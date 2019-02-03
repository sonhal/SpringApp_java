import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import no.oslomet.repository.CustomerRepository;
import no.oslomet.repository.HibernateCustomerRepositoryImpl;
import no.oslomet.service.CustomerService;
import no.oslomet.service.CustomerServiceImpl;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"no.oslomet"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService(){
//        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service =  new CustomerServiceImpl();
//        //service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }

//    @Bean(name = "customerRespository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }
}

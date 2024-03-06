package project_d.aop;

import project_b.service.CustomerService;
import project_c.repo.CustomerRepo;
import project_e.componant.CustomerComponant;
import project_f.config.AppConfig;

public class CustomerAop {
    public static void main(String[] args) {
//        new ApiGateway(); //project a
       new CustomerService(); //project b
      new CustomerRepo(); //project c
      //  new CustomerController(); //project d
//       new CustomerComponant(); //project e*
//        new AppConfig(); //project f*


    }
}

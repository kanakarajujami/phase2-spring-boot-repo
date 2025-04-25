package com.nt.specifications;

import com.nt.entity.User;
import org.springframework.data.jpa.domain.Specification;

public class UserSpecifications {

    public static  Specification<User> hasName(String name){

      return  (root,query,builder)->builder.equal(root.get("name"),name);

    }

   public static Specification<User> hasEmail(String email){

        return (root,query,builder)->
        {
            return builder.equal(root.get("email"),email);
        };
   }

   
   public static Specification<User> hasUserActive(boolean active ){

       return (root,query,criteriaBuilder)->{


           return criteriaBuilder.equal(root.get("active"),active);

       };


   }
}

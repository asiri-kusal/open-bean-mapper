package lk.open.beanmaputils.example;

import java.util.Date;

import lombok.Data;

@Data
public class Contact {

    private Long cotactId;
    private String title;
    private String brnNumber ;
    private String contactMobileNo ;
    private String contactOther ;
    private String faxNumber ;
    private String designation ;
    private String emailAddress ;
    private String preferredCommId ;
    private String contactType ;
    private Date createdDate ;
    private String createdUser ;
    private Date updateDate ;
    private String updateuser ;
    private String remarks ;
    private String isDefault ;
    private String firstName ;
    private String lastName ;
    private Long subscriberSeqNo;
    private String createdByOrderId;
}
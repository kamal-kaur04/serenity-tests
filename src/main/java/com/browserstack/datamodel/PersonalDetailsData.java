package com.browserstack.datamodel;

import lombok.Data;

@Data
public class PersonalDetailsData {

    public String nickName;
    public boolean smoker;
    public String militaryService;

//    public String toReadableString() {
//        return String.format("nickName: %s\nsmoker: %s\nmilitaryService: %s", nickName, smoker, militaryService);
//    }
}

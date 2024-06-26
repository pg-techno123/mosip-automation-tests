package io.mosip.testrig.dslrig.ivv.core.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IDObjectField {

    public enum type {
        string, integer, simpleType
    }

    private Boolean prereg = false;
    private Boolean regclient = false;
    private Boolean ida = false;
    private Boolean mutate = false;
    private IDObjectField.type type;
    private String primaryValue = "";
    private String secondaryValue = "";
}

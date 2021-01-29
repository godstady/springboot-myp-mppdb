package com.dataql.bean;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author dataql
 * @since 2021-01-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class FaceDoorRecord extends Model {

    private static final long serialVersionUID = 1L;

    private String id;

    private String appId;

    private String institutionUuid;

    private String gbIndexId;

    private String residentId;

    private String imageId;

    private String type;

    private String status;

    private String updateTime;


}

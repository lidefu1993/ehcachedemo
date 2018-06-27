package com.ldf.ehcache.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ldf on 2018/6/26.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSchool {
    private String id;
    private String userId;
    private String schoolName;
}

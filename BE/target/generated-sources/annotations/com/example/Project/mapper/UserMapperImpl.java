package com.example.Project.mapper;

import com.example.Project.dto.response.UserResponse;
import com.example.Project.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-12T21:21:46+0700",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setRefreshToken( user.getRefreshToken() );
        if ( user.getRefreshTokenExpired() != null ) {
            userResponse.setRefreshTokenExpired( user.getRefreshTokenExpired() );
        }
        userResponse.setUserId( user.getUserId() );
        userResponse.setUsername( user.getUsername() );

        return userResponse;
    }
}

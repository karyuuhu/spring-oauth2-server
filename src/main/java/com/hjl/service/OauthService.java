package com.hjl.service;

import com.hjl.domain.dto.OauthClientDetailsDto;
import com.hjl.domain.oauth.OauthClientDetails;

import java.util.List;

public interface OauthService {

    OauthClientDetails loadOauthClientDetails(String clientId);

    List<OauthClientDetailsDto> loadAllOauthClientDetailsDtos();

    void archiveOauthClientDetails(String clientId);

    OauthClientDetailsDto loadOauthClientDetailsDto(String clientId);

    void registerClientDetails(OauthClientDetailsDto formDto);
}

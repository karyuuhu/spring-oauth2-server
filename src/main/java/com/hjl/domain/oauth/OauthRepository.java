package com.hjl.domain.oauth;

import com.hjl.domain.shared.Repository;

import java.util.List;

/**
 * 处理 OAuth 相关业务的 Repository
 *
 */
public interface OauthRepository extends Repository {

    OauthClientDetails findOauthClientDetails(String clientId);

    List<OauthClientDetails> findAllOauthClientDetails();

    void updateOauthClientDetailsArchive(String clientId, boolean archive);

    void saveOauthClientDetails(OauthClientDetails clientDetails);
}
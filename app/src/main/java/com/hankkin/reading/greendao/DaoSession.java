package com.hankkin.reading.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.hankkin.reading.domain.AccountBean;
import com.hankkin.reading.domain.TranslateBean;
import com.hankkin.reading.domain.User;
import com.hankkin.reading.domain.WordNoteBean;
import com.hankkin.reading.domain.HotBean;
import com.hankkin.reading.domain.WebExplain;

import com.hankkin.reading.greendao.AccountBeanDao;
import com.hankkin.reading.greendao.TranslateBeanDao;
import com.hankkin.reading.greendao.UserDao;
import com.hankkin.reading.greendao.WordNoteBeanDao;
import com.hankkin.reading.greendao.HotBeanDao;
import com.hankkin.reading.greendao.WebExplainDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig accountBeanDaoConfig;
    private final DaoConfig translateBeanDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig wordNoteBeanDaoConfig;
    private final DaoConfig hotBeanDaoConfig;
    private final DaoConfig webExplainDaoConfig;

    private final AccountBeanDao accountBeanDao;
    private final TranslateBeanDao translateBeanDao;
    private final UserDao userDao;
    private final WordNoteBeanDao wordNoteBeanDao;
    private final HotBeanDao hotBeanDao;
    private final WebExplainDao webExplainDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        accountBeanDaoConfig = daoConfigMap.get(AccountBeanDao.class).clone();
        accountBeanDaoConfig.initIdentityScope(type);

        translateBeanDaoConfig = daoConfigMap.get(TranslateBeanDao.class).clone();
        translateBeanDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        wordNoteBeanDaoConfig = daoConfigMap.get(WordNoteBeanDao.class).clone();
        wordNoteBeanDaoConfig.initIdentityScope(type);

        hotBeanDaoConfig = daoConfigMap.get(HotBeanDao.class).clone();
        hotBeanDaoConfig.initIdentityScope(type);

        webExplainDaoConfig = daoConfigMap.get(WebExplainDao.class).clone();
        webExplainDaoConfig.initIdentityScope(type);

        accountBeanDao = new AccountBeanDao(accountBeanDaoConfig, this);
        translateBeanDao = new TranslateBeanDao(translateBeanDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        wordNoteBeanDao = new WordNoteBeanDao(wordNoteBeanDaoConfig, this);
        hotBeanDao = new HotBeanDao(hotBeanDaoConfig, this);
        webExplainDao = new WebExplainDao(webExplainDaoConfig, this);

        registerDao(AccountBean.class, accountBeanDao);
        registerDao(TranslateBean.class, translateBeanDao);
        registerDao(User.class, userDao);
        registerDao(WordNoteBean.class, wordNoteBeanDao);
        registerDao(HotBean.class, hotBeanDao);
        registerDao(WebExplain.class, webExplainDao);
    }
    
    public void clear() {
        accountBeanDaoConfig.clearIdentityScope();
        translateBeanDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        wordNoteBeanDaoConfig.clearIdentityScope();
        hotBeanDaoConfig.clearIdentityScope();
        webExplainDaoConfig.clearIdentityScope();
    }

    public AccountBeanDao getAccountBeanDao() {
        return accountBeanDao;
    }

    public TranslateBeanDao getTranslateBeanDao() {
        return translateBeanDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public WordNoteBeanDao getWordNoteBeanDao() {
        return wordNoteBeanDao;
    }

    public HotBeanDao getHotBeanDao() {
        return hotBeanDao;
    }

    public WebExplainDao getWebExplainDao() {
        return webExplainDao;
    }

}

package br.com.douglasmotta.naivagtioncomponentappmirror.data.db.repository

import br.com.douglasmotta.naivagtioncomponentappmirror.data.db.dao.UserDAO
import br.com.douglasmotta.naivagtioncomponentappmirror.data.db.toUser
import br.com.douglasmotta.naivagtioncomponentappmirror.data.db.toUserEntity
import br.com.douglasmotta.naivagtioncomponentappmirror.data.model.User
import br.com.douglasmotta.naivagtioncomponentappmirror.ui.registration.RegistrationViewParams

class UserBdDataSource(
    private val userDAO: UserDAO
) : UserRepository {
    override fun createUser(registrationParamView: RegistrationViewParams) {
        val userEntity = registrationParamView.toUserEntity()
        userDAO.save(userEntity)
    }

    override fun getUser(id: Long): User {
        return userDAO.getUser(id).toUser()
    }

    override fun login(username: String, password: String): Long {
        return userDAO.login(username, password)
    }
}
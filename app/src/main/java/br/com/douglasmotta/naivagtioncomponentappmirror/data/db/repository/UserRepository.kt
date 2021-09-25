package br.com.douglasmotta.naivagtioncomponentappmirror.data.db.repository

import br.com.douglasmotta.naivagtioncomponentappmirror.data.model.User
import br.com.douglasmotta.naivagtioncomponentappmirror.ui.registration.RegistrationViewParams

interface UserRepository {

    fun createUser(registrationParamView: RegistrationViewParams)

    fun getUser(id: Long): User

    fun login(username: String, password: String): Long
}
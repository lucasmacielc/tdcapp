package br.com.nglauber.tdcapp.presentation.mapper

import br.com.nglauber.tdcapp.domain.model.Session
import br.com.nglauber.tdcapp.presentation.model.SessionBinding
import javax.inject.Inject

class SessionMapper @Inject constructor() : Mapper<Session, SessionBinding> {
    override fun parse(domain: Session): SessionBinding {
        return SessionBinding(
                domain.id,
                domain.slot,
                domain.order,
                domain.activated,
                domain.title,
                domain.description,
                domain.type,
                domain.time
        )
    }
}
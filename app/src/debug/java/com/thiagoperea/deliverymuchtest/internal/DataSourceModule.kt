package com.thiagoperea.deliverymuchtest.internal

import com.thiagoperea.deliverymuchtest.repository.github.GithubRepository
import com.thiagoperea.deliverymuchtest.repository.github.LocalGithubRepository
import org.koin.dsl.module

val dataSourceModule = module {
    single<GithubRepository> { LocalGithubRepository() }
}
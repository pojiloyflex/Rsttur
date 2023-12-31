package ru.rsttur.domain.usecases

import ru.rsttur.domain.repository.BlogRepository
import javax.inject.Inject

class GetBlog @Inject constructor(private val blogRepository: BlogRepository) {
    suspend operator fun invoke() = blogRepository.getBlog()
}
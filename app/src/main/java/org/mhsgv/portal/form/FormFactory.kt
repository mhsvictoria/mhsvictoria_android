package org.mhsgv.portal.form

object FormFactory {
    @JvmStatic
    @Throws(IllegalStateException::class)
    fun create(formId: Int): FormFragment {
        return when (formId) {
            0 -> Form1Fragment()
            1 -> Form2Fragment()
            2 -> Form3Fragment()
            else -> throw IllegalStateException("Haven't defined this one, yet.")
        }
    }
}
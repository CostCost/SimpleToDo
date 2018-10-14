package apps.jizzu.simpletodo.settings.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import apps.jizzu.simpletodo.R
import apps.jizzu.simpletodo.settings.fragment.base.BaseSettingsFragment
import kotlinx.android.synthetic.main.fragment_licenses.*


class FragmentLicenses : BaseSettingsFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_licenses, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle("L I C E N S E S")
        initButtons()
    }

    private fun initButtons() {
        buttonKotterKnife.setOnClickListener { openUri(KOTTER_KNIFE_PAGE) }
        buttonCircularAnim.setOnClickListener { openUri(CIRCULAR_ANIM_PAGE) }
        buttonMaterialSearchView.setOnClickListener { openUri(MATERIAL_SEARCH_VIEW_PAGE) }
    }

    private fun openUri(uri: String) = startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(uri)))

    private companion object {
        const val KOTTER_KNIFE_PAGE = "https://github.com/JakeWharton/kotterknife"
        const val CIRCULAR_ANIM_PAGE = "https://github.com/XunMengWinter/CircularAnim"
        const val MATERIAL_SEARCH_VIEW_PAGE = "https://github.com/MiguelCatalan/MaterialSearchView"
    }
}
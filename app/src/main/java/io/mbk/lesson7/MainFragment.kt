package io.mbk.lesson7

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import io.mbk.lesson7.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val data = arrayListOf<Lesson>()
    private lateinit var adapter: LessonAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        binding.recycler.layoutManager = GridLayoutManager(requireContext(), 2)
        adapter =
            LessonAdapter(data, requireContext(), this::onAdapterClick, this::onAdapterLongClick)
        binding.recycler.adapter = adapter
    }

    private fun onAdapterClick(pos: Int) {
        showToast(pos.toString())
    }

    private fun onAdapterLongClick(pos: Int) {
        val alertDialog = AlertDialog.Builder(requireContext())
        alert("Delate", "are you sure")

    }

    private fun loadData() {
        data.add(
            Lesson(
                "https://previews.123rf.com/images/pixelalex/pixelalex1605/pixelalex160500075/58387672-math-science-concept-school-lesson-items-outline-icons.jpg",
                "Math",
                R.color.red,
                R.color.red_second
            )
        )

        data.add(
            Lesson(
                "https://cdn-icons-png.flaticon.com/512/1651/1651650.png",
                "Geography",
                R.color.orange,
                R.color.orange_second
            )
        )

        data.add(
            Lesson(
                "https://cdn2.iconfinder.com/data/icons/educatix-circular/128/education_school_college-12-512.png",
                "Chemistry",
                R.color.blue,
                R.color.blue_second
            )
        )

        data.add(
            Lesson(
                "https://thumbs.dreamstime.com/b/biology-school-subject-icon-education-science-discipline-related-elements-flat-style-vector-illustration-isolated-191863734.jpg",
                "Biology",
                R.color.green,
                R.color.green_second
            )
        )
    }

}
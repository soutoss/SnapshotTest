package com.soutosss.snapshottest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter : ListAdapter<Email, EmailAdapter.ViewHolder>(EmailDiff()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.view_recycler_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView by lazy { itemView.findViewById<TextView>(R.id.label_title) }
        private val subject: TextView by lazy { itemView.findViewById<TextView>(R.id.label_subject) }
        private val message: TextView by lazy { itemView.findViewById<TextView>(R.id.label_message) }


        fun bind(email: Email) {
            title.text = email.title
            subject.text = email.subject
            message.text = email.message
        }
    }


    class EmailDiff : DiffUtil.ItemCallback<Email>() {
        override fun areItemsTheSame(oldItem: Email, newItem: Email): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Email, newItem: Email): Boolean {
            return oldItem == newItem
        }

    }

}
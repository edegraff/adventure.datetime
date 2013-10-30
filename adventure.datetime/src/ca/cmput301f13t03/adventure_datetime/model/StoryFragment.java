/*
 *        Copyright (c) 2013 Andrew Fontaine, James Finlay, Jesse Tucker, Jacob Viau, and
 *         Evan DeGraff
 *
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of
 *         this software and associated documentation files (the "Software"), to deal in
 *         the Software without restriction, including without limitation the rights to
 *         use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 *         the Software, and to permit persons to whom the Software is furnished to do so,
 *         subject to the following conditions:
 *
 *         The above copyright notice and this permission notice shall be included in all
 *         copies or substantial portions of the Software.
 *
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *         IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *         FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 *         COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 *         IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package ca.cmput301f13t03.adventure_datetime.model;

import android.database.Cursor;

import java.util.Collection;

public class StoryFragment {

	private long storyID;
	private long fragmentID;
	private Collection<String> storyMedia;
	private String storyText;
	private Collection<Choice> choices;

	public StoryFragment(Cursor cursor) {
		storyID = cursor.getLong(cursor.getColumnIndex(StoryDB.STORYFRAGMENT_COLUMN_STORYID));
		fragmentID = cursor.getLong(cursor.getColumnIndex(StoryDB._ID));
		storyText = cursor.getString(cursor.getColumnIndex(StoryDB.STORYFRAGMENT_COLUMN_CONTENT));
		/* TODO figure out JSON serialization for choices and media */
	}

	public long getStoryID() {
		return storyID;
	}

	public void setStoryID(long storyID) {
		this.storyID = storyID;
	}

	public long getFragmentID() {
		return fragmentID;
	}

	public void setFragmentID(long fragmentID) {
		this.fragmentID = fragmentID;
	}

	public Collection<String> getStoryMedia() {
		return storyMedia;
	}

	public void setStoryMedia(Collection<String> storyMedia) {
		this.storyMedia = storyMedia;
	}

	public void addMedia(String media) {
		storyMedia.add(media);
	}

	public void removeMedia(String media) {
		storyMedia.remove(media);
	}

	public String getMedia(int id) {
		return (String) storyMedia.toArray()[id];
	}

	public String getStoryText() {
		return storyText;
	}

	public void setStoryText(String storyText) {
		this.storyText = storyText;
	}

	public Collection<Choice> getChoices() {
		return choices;
	}

	public void setChoices(Collection<Choice> choices) {
		this.choices = choices;
	}

	public void addChoice(Choice choice) {
		choices.add(choice);
	}

	public void removeChoice(Choice choice) {
		choices.remove(choice);
	}

	public Choice getChoice(int id) {
		return (Choice) choices.toArray()[id];
	}
}

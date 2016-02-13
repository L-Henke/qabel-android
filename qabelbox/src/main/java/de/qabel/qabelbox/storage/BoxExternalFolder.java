package de.qabel.qabelbox.storage;

import de.qabel.core.crypto.QblECPublicKey;

public class BoxExternalFolder extends BoxFolder implements BoxExternal {

	public QblECPublicKey owner;

	public BoxExternalFolder(String ref, String name, byte[] key) {
		super(ref, name, key);
	}

	@Override
	public QblECPublicKey getOwner() {
		return owner;
	}

	@Override
	public void setOwner(QblECPublicKey owner) {
		this.owner = owner;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		BoxExternalFolder that = (BoxExternalFolder) o;

		return !(owner != null ? !owner.equals(that.owner) : that.owner != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (owner != null ? owner.hashCode() : 0);
		return result;
	}
}